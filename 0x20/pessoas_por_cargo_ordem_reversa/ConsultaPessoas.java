package pessoas_por_cargo_ordem_reversa;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoa) {
	return pessoa.stream().collect(Collectors.groupingBy(p -> p.getCargo()));
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoa) {
	return pessoa.stream().collect(
		Collectors.groupingBy(Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, Collectors.toList())));
    }

    public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoa) {
	return pessoa.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
		Collectors.filtering(p -> p.getIdade() > 40, Collectors.toList())));
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoa) {
	return pessoa.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
		() -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));
    }
}
