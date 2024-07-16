package example;

import kotlinx.datetime.LocalDate;

class JavaStuff {

  public static void main(String[] args) {
    LocalDate foo = DateHolder.INSTANCE.getDate();
    System.out.println(foo); // 2021-08-01
    KotlinStuff.INSTANCE.main();
  }

}
