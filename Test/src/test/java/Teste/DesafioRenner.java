package Teste;

import Elementos.ElementosWeb;
import Metodos.Metodos;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class DesafioRenner {


    Metodos metodo = new Metodos();
    ElementosWeb el = new ElementosWeb();

    @Before

    public void iniciar() throws IOException {

        metodo.abrirNavegador("http://automationpractice.com/.", "CHROME", "Acessar Loja");

    }

    @After

    public void finalizar() {


        metodo.killDriver("fim do teste");

    }


    @Test
    public void testECommerce() throws IOException {

        //*******************************************************
        //SingIn
        //*******************************************************

        metodo.clicar(el.getSingIn(), "clicar em SingIn");
        metodo.scroll(el.getBtnSingIn());
        metodo.preencher(el.getEmail(), "yejobih446@oemmeo.com", "Preencher Campo email");
        metodo.preencher(el.getPasswd(), "teste", "Preencher Campo Senha");
        metodo.clicar(el.getBtnSingIn(), "clicar em singin");

        //*******************************************************
        //Printed Chiffon Dress verde
        //*******************************************************

        metodo.preencher(el.getBusca(), "Printed Chiffon Dress", "buscar produto");
        metodo.clicar(el.getBtnBusca(), "Clicar na lupa");
        metodo.scroll(el.getProduto());
        metodo.espera(4000);
        metodo.passarMouse(el.getResultBusca(), el.getCorVerde());
        metodo.espera(4000);
        metodo.scroll(el.getDescVestido());
        metodo.clicar(el.getSelecTamanho(), "size");
        metodo.clicar(el.getAddToCart(), "add no carrinho");
        metodo.espera(4000);
        metodo.clicar(el.getContinueShopping(), "continue comprando");

        //*****************************************************
        //Faded Short azul
        //*****************************************************

        metodo.scroll(el.getBusca());
        metodo.clicar(el.getBusca(), "");
        metodo.preencher(el.getBusca(), "Faded Short", "buscar produto");
        metodo.clicar(el.getBtnBusca(), "Clicar na lupa");
        metodo.scroll(el.getProduto());
        metodo.passarMouse(el.getResultBusca(), el.getCorAzul());
        metodo.espera(4000);
        metodo.scroll(el.getAddToCart());
        metodo.clicar(el.getAddToCart(), "");
        metodo.espera(4000);
        metodo.clicar(el.getContinueShopping(), "");

        //*****************************************************
        //Blouse 2
        //*****************************************************

        metodo.scroll(el.getBusca());
        metodo.clicar(el.getBusca(), "");
        metodo.preencher(el.getBusca(), "Blouse", "buscar produto");
        metodo.clicar(el.getBtnBusca(), "Clicar na lupa");
        metodo.scroll(el.getProduto());
        metodo.passarMouse(el.getResultBusca(), el.getMore());
        metodo.espera(4000);
        metodo.clicar(el.getQtyUp(), "");
        metodo.scroll(el.getAddToCart());
        metodo.clicar(el.getAddToCart(), "");
        metodo.espera(4000);
        metodo.clicar(el.getContinueShopping(), "");

        // Printed Dress

        metodo.scroll(el.getBusca());
        metodo.clicar(el.getBusca(), "");
        metodo.clear(el.getBusca());
        metodo.preencher(el.getBusca(), "Printed Dress", "buscar produto");
        metodo.clicar(el.getBtnBusca(), "Clicar na lupa");
        metodo.scroll(el.getProduto());
        metodo.passarMouse(el.getPrintedDress(), el.getPrintedDressAdd());
        metodo.espera(4000);
        metodo.clicar(el.getCheckout(), "");
    }

@Test
    public void cadastro() throws IOException {

        metodo.clicar(el.getSingIn(), "clicar em SingIn");
        metodo.clicar(el.getCreateAnAccount(), "Clicar em campo digitável");
        metodo.emailRandom(el.getCreateAnAccount());
        metodo.clicar(el.getSubmitCreate(), "Clicar em create");
        metodo.espera(4000);
        metodo.clicar(el.getIdGender2(), "Selecionar Mrs");
        metodo.preencher(el.getFirstName(), "Test", "Preencher primeiro nome");
        metodo.preencher(el.getLastName(), "Renner", "Preencher ultimo nome");
        metodo.preencher(el.getPasswd(), "test@123", "senha");

    }

}

	
	



