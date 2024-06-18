package raisetech.StudentManagement;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

  public static void main(String[] args) {
    String message = "Hhello World";

    //文字列を反転させる
    String reversedMessage = StringUtils.reverse(message);
    System.out.println(reversedMessage);
  }

}
