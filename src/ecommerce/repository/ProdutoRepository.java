package ecommerce.repository;

	import ecommerce.model.Produto;

	public interface ProdutoRepository {

	
		public void criarProduto(Produto produto);
		public void listarProdutos();
		public void consultarProdutoPorId(int numero);
		public void atualizarProduto(Produto produto);
		public void deletarProduto(int numero);
			
	}