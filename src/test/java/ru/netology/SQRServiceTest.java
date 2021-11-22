package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest{
        private final SQRService service=new SQRService();
@ParameterizedTest
@CsvSource({"200, 300, 3"});  // ввод данных
public void shouldSQR(int lowerRange,int upRange,int expected){
       assertEquals(expected, service.main(lowerRange, upRange));

        //int actual = service.main(expected, actual);

       }
}

// ввод данных
// long lowerRange = 200;
// long UpRange = 300;
//  int expected =3;

// @Test
// void main() {
//    SQRService service = new SQRService();
//     int j;
//    int[] internalСycle = {j = 10; j <= 99};
//    int expected = 3;
//    int actual = service.main(internalСycle);
//   assertEquals(expected, actual);

//   }
//}