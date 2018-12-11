package br.com.db1.cidade.api.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import br.com.db1.cidade.api.model.Cidade;
import br.com.db1.cidade.api.model.Uf;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CidadeRepositoryTest {

	@Autowired
	private CidadeRepository cidadeRepository;

	@Test
	public void deveSalvarUmaNovaCidade() {

		Cidade cidade = new Cidade("Maringá", Uf.PR);
		cidadeRepository.save(cidade);

	}

}
