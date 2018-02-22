class Dog
{

  Dog(String name, int tosi)
  {
    System.out.println("犬の名前は" + name + "です。年齢は" + tosi + "歳です。");
  }

  Dog(String name)
  {
      System.out.println("犬の名前は" + name + "です。年齢はわかりませんでした。");
  }
}

public class Test3
{
	public static void main(String[] args)
    {
    Dog dog1 = new Dog("シロ",3);
    Dog dog2 = new Dog("ホワイト");
    }
}