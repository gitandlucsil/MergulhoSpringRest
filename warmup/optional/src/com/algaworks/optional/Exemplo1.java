package com.algaworks.optional;

import java.math.BigDecimal;
import java.util.Optional;

import com.algaworks.optional.domain.CatalogoProdutos;
import com.algaworks.optional.domain.Produto;

public class Exemplo1 {

	public static void main(String[] args) {
		CatalogoProdutos catalogo = new CatalogoProdutos();
		
//		Produto produto = catalogo.buscar("Picanha 2kg");
//		if(produto != null) {
//			produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//			System.out.println(produto.getPreco());
//		}
		
//		Optional<Produto> produtoOptional = catalogo.buscarOptional("Picanha 1kg");
//		if(produtoOptional.isPresent()) {
//			Produto produto = produtoOptional.get();
//			produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//			System.out.println(produto.getPreco());
//		}
		
//		Optional<Produto> produtoOptional = catalogo.buscarOptional("Picanha 1kg");
//		produtoOptional.ifPresent(produto -> {
//			produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//			System.out.println(produto.getPreco());
//		});
		
		catalogo.buscarOptional("Picanha 1kg").stream().forEach(
				produto -> {
					produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
					System.out.println(produto.getPreco());
				});
	}
}
