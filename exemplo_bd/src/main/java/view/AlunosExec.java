package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		
		try {
			
			alunos.setNome("Tayná Souza Torres Dourado");
			alunos.setEndereco("Rua Ambuá, 174");
			alunos.setBairro("Itaim Paulista");
			
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			alunosJdbcDao.salvar(alunos);
			//alunosJdbcDao.listar():
			//alunosJdbcDao.alterar(alunos);
			//alunosJdbcDao.excluir(3);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
