/*  Annotations in Java:

==>Annotations provides metadata to class/methods.
==>Annotations start with '@'.
==>Annotations are helpful for detecting erros. Example : @override annotations will make sure that there are no typos
while overriding a method.
Important Annotations In Java :

1.@Override:

==>This annotation makes sure that the sub class method is successfully overriding the parent class method.
==>While overriding a class, there is a chance of typing errors or spelling mistakes. In such cases, the method will
not get overridden and you will get an error.
==>Override exception helps us to encounter such situations by extracting a warning from the compiler.

Example :

class KeyPadPhone{
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}

public class CWH{
        public static void main(String args[]){
            AndroidPhone Samsung = new AndroidPhone();
            Samsung.sendMessage();
}
}

Output :
Message sent via WhatsApp!

2.@Deprecated :

==>This annotation is used to mark a deprecated method.
==>If developer uses the deprecated method then the compiler generated a warning.
==>There high chance of removal of deprecated methods in future versions therefore it is better to not use them.

Example :

class KeyPadPhone{
    @Deprecated
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}

public class {
        public static void main(String args[]){
            AndroidPhone Samsung = new AndroidPhone();
            Samsung.sendMessage();
}
}

Build Output :
java: sendMessage() in KeyPadPhone has been deprecated

3.@SupressWarnings :

==>This annotation helps us to suppress some warnings that are being generated by compiler.

Example :

class KeyPadPhone{
    @Deprecated
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}

public class CWH{
        public static void main(String args[]){
            @SuppressWarnings("deprecation")
            AndroidPhone Samsung = new AndroidPhone();
            Samsung.sendMessage();
}
}

Build Output :
This time no warning is generated because we've suppressed the deprecation warning.

4.@FunctionInterface :

==>An interface which contains only one abstract method is known as functional interface.
==>@FunctionInterface annotation helps us to make sure that a functional interface is not having more than one abstract method.

Example :

@FunctionalInterface
interface myFunctionalInterface {
    void method1();
    void methodd2();
}
public class CWH{
        public static void main(String args[]){
            System.out.println("Functonal interface annotation");

}
}

Output :
java: Unexpected @FunctionalInterface annotation
  myFunctionalInterface is not a functional interface
    multiple non-overriding abstract methods found in interface myFunctionalInterface

The above code generates error because the myFunctionInterface is containing more than one abstract method.         */

@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class Javaannotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
    }
}
