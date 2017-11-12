/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.unidavi.edu.br.atividade6_reescrita.Hangman;
import org.junit.Assert;

import org.junit.Test;

/**
 *
 * @author gt2a
 */
public class HangmanTest6 {
    
    @Test
	public void deveRetornarPlaceHolderParaInstanceof(){
		Hangman hangman  = new Hangman("instanceof");
		String placeholder = hangman.play("u");
		Assert.assertEquals("**********", placeholder);
	}

	@Test
	public void deveRetornarPlaceHolderParaInstanceofComUmaLetraCerta(){
		Hangman hangman  = new Hangman("instanceof");
		String placeholder = hangman.play("i");
		Assert.assertEquals("i*********", placeholder);
        }

	@Test
	public void deveRetornarPlaceHolderParaFor(){
		Hangman hangman  = new Hangman("for");
		String placeholder = hangman.play("u");
		Assert.assertEquals("***", placeholder);
	}

	@Test
	public void deveRetornarPlaceHolderParaForComTodasCertas(){
		Hangman hangman  = new Hangman("for");
		hangman.play("u");
		hangman.play("f");
		hangman.play("o");
		String placeholder = hangman.play("r");
		Assert.assertEquals("for", placeholder);
	}
        
	@Test
	public void deveVencerComApenas1Erro(){
		Hangman hangman  = new Hangman("for");
		hangman.play("u");
		hangman.play("f");
		hangman.play("o");
		hangman.play("r");
		Assert.assertEquals(true, hangman.won());
		Assert.assertEquals(1, hangman.getWrongAttempts());
	}

	@Test
	public void devePerderApos6Erros(){
		Hangman hangman  = new Hangman("public");
		hangman.play("a");
		hangman.play("e");
		hangman.play("i");
		hangman.play("o");
		hangman.play("u");
		hangman.play("s");
		hangman.play("t");
		hangman.play("l");
		Assert.assertEquals(false, hangman.won());
		Assert.assertEquals(5, hangman.getWrongAttempts());
	}
        
        @Test
	public void deveRetornarGetCanPlay(){
            Hangman hangman  = new Hangman("for");
		hangman.play("u");
		hangman.play("f");
		hangman.play("o");
		hangman.play("r");
            Assert.assertEquals(false, hangman.getCanPlay());
	}
}
