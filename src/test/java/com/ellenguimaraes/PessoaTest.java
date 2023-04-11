package com.ellenguimaraes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class PessoaTest 
{
   
    @Test
    void testOlaMundo()
    {
        Pessoa pessoa = new Pessoa();
        assertEquals("Olá, Mundo!", pessoa.olaMundo());
    }
}
