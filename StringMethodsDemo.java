class StringMethodsDemo {
   public static void main(String[] var0) {
      String s = "kdp patan";
      System.out.println("lenght = " + s.length());
      System.out.println("character at 5th index = " + s.charAt(5));
      System.out.println("String contains kdp = " + s.contains("kdp"));
      System.out.println("String contains kdpp = " + s.contains("kdpp"));

      String test = "AOOP,ISE,CN,IWD,MPT,IPDC";
      String subjects[] = test.split(",");

      for(String sub : subjects){
        System.out.println(sub);
      }

      String name = "apurv";
      int age = 16;
      double salary = 60000;

      String FormatString = String.format("My name is %s\nMy age is %d\nMy salary is %.2f",name,age,salary);

      System.out.println(FormatString);
   }
}
