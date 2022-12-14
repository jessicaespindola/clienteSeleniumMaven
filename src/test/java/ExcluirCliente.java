import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcluirCliente {
   @Test
   public void excluirClienteComSucesso() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/jessica.espindola/IdeaProjects/AutomacaoSeleniumJavaMaven/src/drive/chromedriver");
        WebDriver navegar = new ChromeDriver();

        // PRÉ-CONDIÇÃO:
        navegar.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");

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
            System.out.println("A mensagem encontrada ao cadastrar o cliente com sucesso foi: " + mensagemSucesso);
        }

        Thread.sleep(5000);
        navegar.findElement(By.cssSelector("a[href=\"/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4/\"]")).click();

        navegar.findElement(By.cssSelector("input[placeholder=\"Search CustomerName\"]")).sendKeys("Automação Java - Maven", Keys.ENTER);
        Thread.sleep(3000);
        navegar.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]/div/input")).click();
        navegar.findElement(By.cssSelector("i[class=\"fa fa-times el el-remove clear-search\"]")).click();


        String alertaModal = navegar.findElement(By.cssSelector("p[class='alert-delete-multiple-one']")).getText();
        String expectedConfirmarExclusao = "Are you sure that you want to delete this 1 item?";

        if(alertaModal.equals(expectedConfirmarExclusao)){
            System.out.println("Sucesso");
        }else{
            System.out.println("A mensagem encontrada ao confirmar a exclusão do cliente foi: " + alertaModal);
        }

        navegar.findElement(By.cssSelector("button[class='btn btn-danger delete-multiple-confirmation-button']")).click();
        Thread.sleep(3000);

        String alert = navegar.findElement(By.xpath("/html/body/div[3]/span[3]/p")).getText();

        String expectedAlerta = "Your data has been successfully deleted from the database.";

        if(alertaModal.equals(expectedAlerta)){
            System.out.println("Sucesso");
        }else{
            System.out.println("A mensagem encontrada ao finalizar o processo de exclusão foi: " + alert);
        }

        navegar.close();
   }
}
