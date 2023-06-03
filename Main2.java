class Main2 {
  public static void main(String[] args) {
    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);
    // 変数numberを9で上書き
    number = 9;
    // 変数numberを出力
    System.out.println(number);
    // 変数textを「Java」で上書き
    text = "Java";
    // 変数textを出力
    System.out.println(text);
    
    int number1 = 3;
    System.out.println(number1);
    // 変数number1の値に7を足して、変数numberを上書き
    number1 = number1 + 7;
    // 変数number1を出力
    System.out.println(number1);
    
    int number2 = 8;
    
    // 変数number2に7をかけて、変数number2を上書き
    number2 *= 7;
    // 変数number2を出力
    System.out.println(number2);
    // 変数number2の値に1を足して、変数number2を上書き
    number2 ++;
    // 変数number2を出力
    System.out.println(number2);
    
    int length = 6;
    int height = 8;
    
    // 変数rectangleAreaに、四角形の面積を代入
    int rectangleArea = length * height;
    // 変数rectangleAreaを出力
    System.out.println(rectangleArea);
    // 変数triangleAreaに、三角形の面積を代入
    int triangleArea = length * height / 2;
    // 変数triangleAreaを出力
    System.out.println(triangleArea);
    
    // double型の変数number3を定義し、8.5を代入
    double number3 = 8.5;
    // double型の変数number4を定義し、3.4を代入
    double number4 = 3.4;
    // number3にnumber4を足した値を出力
    System.out.println(number3 + number4);
    // number3からnumber4を引いた値を出力
    System.out.println(number3 - number4);
    
    
    int month = 12;
    int date = 31;
    // 「12月31日」となるように変数と文字列を連結して出力
    System.out.println(month + "月" + date + "日");
    // 7を2で割った値を出力
    System.out.println(7 / 2);
    // 7.0を2.0で割った値を出力
    System.out.println(7.0 / 2.0);
    // 7を2.0で割った値を出力
    System.out.println(7 / 2.0);
    
    
    int number5 = 7;
    int number6 = 2;
    System.out.println(number5 / number6);
    // number5をdouble型にキャストし、number6で割った値を出力
    System.out.println((double)number5 / number6);
  }
}