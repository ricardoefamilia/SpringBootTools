package springbootricardo01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springbootricardo01.model.Pessoa;

@Repository
@Transactional
public interface IPessoaRepository extends CrudRepository<Pessoa, Long>{

}
