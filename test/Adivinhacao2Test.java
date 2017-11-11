
import br.unidavi.edu.br.atividade2_escrita.Adivinhacao;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gt2a
 */
public class Adivinhacao2Test {
    
    @Test
    public void deveRetornarNumeroIgualSorteio(){

        Adivinhacao adivinha = new Adivinhacao();
        adivinha.opcaoMenu("1");// de 0 a 20
        String placeholder = adivinha.Jogar("6",6);
        Assert.assertEquals("igual", placeholder);
    }
    
    @Test
    public void deveRetornarNumeroSorteioMenor(){

        Adivinhacao adivinha = new Adivinhacao();
        adivinha.opcaoMenu("1");// de 0 a 20
        String placeholder = adivinha.Jogar("7",5);
        Assert.assertEquals("menor", placeholder);
    }
    
    @Test
    public void deveRetornarNumeroSorteioMaior(){

        Adivinhacao adivinha = new Adivinhacao();
        adivinha.opcaoMenu("1");// de 0 a 20
        String placeholder = adivinha.Jogar("3",5);
        Assert.assertEquals("maior", placeholder);
    }
    
    @Test
    public void deveRetornarNumeroInvalidoNegativo(){

        Adivinhacao adivinha = new Adivinhacao();
        adivinha.opcaoMenu("1");// de 0 a 20
        String placeholder = adivinha.Jogar("-10",5);
        Assert.assertEquals("invalido", placeholder);
    }
    
    @Test
    public void deveRetornarNumeroInvalidoMaior20(){

        Adivinhacao adivinha = new Adivinhacao();
        adivinha.opcaoMenu("1");// de 0 a 20
        String placeholder = adivinha.Jogar("21",5);
        Assert.assertEquals("invalido", placeholder);
    }
    
    @Test
    public void deveRetornarNumeroInvalidoMenor100(){

        Adivinhacao adivinha = new Adivinhacao();
        adivinha.opcaoMenu("2");// de 0 a 100
        String placeholder = adivinha.Jogar("50",5);
        Assert.assertEquals("menor", placeholder);
    }
    
    @Test
    public void deveRetornarPerguntaParaOpcao(){

        Adivinhacao adivinha = new Adivinhacao();
        String opcao = adivinha.opcaoMenu("3");// de 0 a n
        Assert.assertEquals("pergunta", opcao);
    }
    
    @Test
    public void deveRetornarOKParaOpcao(){

        Adivinhacao adivinha = new Adivinhacao();
        String opcao1 = adivinha.opcaoMenu("1");// de 0 a 20
        String opcao2 = adivinha.opcaoMenu("2");// de 0 a 20
        Assert.assertEquals("ok", opcao1);
        Assert.assertEquals("ok", opcao2);
    }
    
    @Test
    public void deveRetornarInvalidoParaOpcao(){

        Adivinhacao adivinha = new Adivinhacao();        
        String opcao1 = adivinha.opcaoMenu("4");// invalido
        String opcao2 = adivinha.opcaoMenu("a");// invalido
        Assert.assertEquals("invalido", opcao1);
        Assert.assertEquals("invalido", opcao2);
    }
    
    @Test
    public void devePerderApos5Erros(){

        Adivinhacao adivinha = new Adivinhacao();
        adivinha.opcaoMenu("1");// de 0 a 20
        adivinha.Jogar("1",5);
        adivinha.Jogar("2",5);
        adivinha.Jogar("3",5);
        adivinha.Jogar("4",5);
        adivinha.Jogar("6",5);
        Assert.assertEquals(false, adivinha.getAcertou());
	Assert.assertEquals(5, adivinha.getTentativa());
    }
    
    @Test
    public void deveVencerApos3Tentativas(){

        Adivinhacao adivinha = new Adivinhacao();
        adivinha.opcaoMenu("1");// de 0 a 20
        adivinha.Jogar("1",5);
        adivinha.Jogar("2",5);
        adivinha.Jogar("5",5);        
        Assert.assertEquals(true, adivinha.getAcertou());
	Assert.assertEquals(3, adivinha.getTentativa());
    }
}
