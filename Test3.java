class Dog
{

  Dog(String name, int tosi)
  {
    System.out.println("���̖��O��" + name + "�ł��B�N���" + tosi + "�΂ł��B");
  }

  Dog(String name)
  {
      System.out.println("���̖��O��" + name + "�ł��B�N��͂킩��܂���ł����B");
  }
}

public class Test3
{
	public static void main(String[] args)
    {
    Dog dog1 = new Dog("�V��",3);
    Dog dog2 = new Dog("�z���C�g");
    }
}