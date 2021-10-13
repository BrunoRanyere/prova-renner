package Elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	
	// ***********************************************************
	// ELEMENTOS WEB ENCAPSULADOS
	// ***********************************************************

	private By singIn= By.xpath("//a[@class='login']");

	private By email= By.xpath("//*[@id='email']");

	private By passwd= By.xpath("//*[@id='passwd']");

	private By btnSingIn= By.xpath("//*[@id='SubmitLogin']");

	private By busca= By.xpath("//input[@id='search_query_top']");

	private By btnBusca= By.xpath("//button[@name='submit_search']");

	private By resultBusca = By.xpath("//*[@class='product-container']");

	private By descVestido= By.xpath("//*[@class='pb-center-column col-xs-12 col-sm-4']");

	private By selecTamanho= By.xpath("//*[@title='M']");

	private By produto= By.xpath("//*[@class='product-container']");

	private By corVerde= By.cssSelector("#color_37");

	private By addToCart= By.cssSelector("#add_to_cart > button");

	private By continueShopping= By.xpath("//*[@title='Continue shopping']");

	private By corAzul = By.xpath("//*[@id='color_2']");

	private By more = By.xpath("//*[@title='View']");

	private By qtyUp = By.xpath("//*[@class='btn btn-default button-plus product_quantity_up']");

	private By printedDress = By.xpath("//*[@href='http://automationpractice.com/index.php?id_product=4&controller=product&search_query=Printed+Dress&results=5']");

	private By printedDressAdd = By.xpath("//*[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=4&token=964ad54433343da36c36193a1509bc24']");

	private By checkout = By.xpath("//*[@title='Proceed to checkout']");

	private By createAnAccount = By.xpath("//*[@id='email_create']");

	private By submitCreate =By.xpath("//*[@name='SubmitCreate']");

	private By idGender2 = By.xpath("//*[@for='id_gender2']");

	private By firstName = By.xpath("//*[@id='customer_firstname']");

	private By lastName = By.xpath("//*[@id='customer_lastname']");

	//************************************************************
	//Getter
	//************************************************************


	public By getSingIn() {
		return singIn;
	}

	public By getEmail(){
		return email;
	}

	public By getPasswd(){
		return passwd;
	}

	public By getBtnSingIn(){
		return btnSingIn;
	}

	public By getBusca(){
		return busca;
	}

	public By getBtnBusca(){
		return btnBusca;
	}

	public By getResultBusca(){
		return resultBusca;
	}


	public By getDescVestido(){
		return descVestido;
	}

	public By getSelecTamanho(){
		return selecTamanho;
	}


	public By getProduto(){
		return produto;
	}

	public By getCorVerde() {
		return corVerde;
	}

	public By getAddToCart() {
		return addToCart;
	}

	public By getContinueShopping() {
		return continueShopping;
	}

	public By getCorAzul() {
		return corAzul;
	}


	public By getMore() {
		return more;
	}

	public By getQtyUp() {
		return qtyUp;
	}

	public By getPrintedDress() {
		return printedDress;
	}

	public By getPrintedDressAdd() {
		return printedDressAdd;
	}

	public By getCheckout() {
		return checkout;
	}

	public By getCreateAnAccount() {
		return createAnAccount;
	}

	public By getSubmitCreate() {
		return submitCreate;
	}

	public By getIdGender2() {
		return idGender2;
	}

	public By getFirstName() {
		return firstName;
	}

	public By getLastName() {
		return lastName;
	}
}
	
	