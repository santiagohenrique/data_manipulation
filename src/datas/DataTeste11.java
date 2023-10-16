package datas;

public class DataTeste11 {
  public static void main(String[] args) {
	Data11 data11 = new Data11(28,2,1900);
    System.out.println(data11.getDia());
    System.out.println(data11.getMes());
    System.out.println(data11.getAno());
    System.out.println(data11.anoBissexto());
  }
}
