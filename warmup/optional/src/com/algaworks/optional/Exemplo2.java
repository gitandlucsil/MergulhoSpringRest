package com.algaworks.optional;

import java.math.BigDecimal;

import com.algaworks.optional.domain.CatalogoProdutos;

public class Exemplo2 {

	public static void main(String[] args) {
		CatalogoProdutos catalogo = new CatalogoProdutos();
//		BigDecimal preco = catalogo.buscarPreco("Picanha 1kg").orElse(BigDecimal.ZERO);
//		System.out.println(preco);
		
		BigDecimal preco = catalogo.buscarPreco("Picanha 1kg").orElseThrow(
				() -> new RuntimeException("Preco do produto nao encontrado!"));
		System.out.println(preco);
	}

}
