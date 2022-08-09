import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastrarCliente {
    @Test
    public void cadastrarClienteComSucesso() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/jessica.espindola/IdeaProjects/AutomacaoSeleniumJavaMaven/src/drive/chromedriver");
        WebDriver navegar = new ChromeDriver();
        navegar.manage().window().maximize();

        navegar.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");

        navegar.findElement(By.cssSelector("select[id='switch-version-select']")).click();
        navegar.findElement(By.cssSelector("select[id='switch-version-select']")).sendKeys("Bootstrap V4 Theme", Keys.ENTER);
        navegar.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")).click();
        navegar.findElement(By.cssSelector("input[id='field-customerName']")).sendKeys("Automação Java - Maven");
        navegar.findElement(By.cssSelector("input[id='field-contactLastName']")).sendKeys("Estudo");
        navegar.findElement(By.cssSelector("input[id='field-contactFirstName']")).sendKeys("Jéssica Espíndola da Silva");
        navegar.findElement(By.cssSelector("input[id='field-phone']")).sendKeys("48 9999-9999");
        navegar.findElement(By.cssSelector("input[id='field-addressLine1']")).sendKeys("Rua Rosa das Rosas");
        navegar.findElement(By.cssSelector("input[id='field-addressLine2']")).sendKeys("Compl");
        navegar.findElement(By.cssSelector("input[id='field-city']")).sendKeys("Criciúma");
        navegar.findElement(By.cssSelector("input[id='field-state']")).sendKeys("SC");
        navegar.findElement(By.cssSelector("input[id='field-postalCode']")).sendKeys("88818-000");
        navegar.findElement(By.cssSelector("input[id='field-country']")).sendKeys("Brasil");
      //  navegar.findElement(By.cssSelector("input[class='numeric form-control']")).sendKeys("Fixed");
        navegar.findElement(By.cssSelector("input[id='field-creditLimit']")).sendKeys("121");
        navegar.findElement(By.cssSelector("button[class=\"btn btn-secondary btn-success b10\"]")).click();
        String mensagemSucesso = navegar.findElement(By.cssSelector("div[id=\"report-success\"]")).getText();
        String expected = "Your data has been successfully stored into the database. Edit Record or Go back to list";

        if(mensagemSucesso.equals(expected)){
            System.out.println("Sucesso");
        }else{
            System.out.println("A mensagem encontrada foi: " + mensagemSucesso);
        }
        navegar.close();
    }
}
