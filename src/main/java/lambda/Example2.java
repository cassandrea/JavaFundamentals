package main.java.lambda;

interface MyFunc<T> {
    T func(T n);
}

class FactorialLambdaDemo2 {
    public static void main(String args[])
    {

        // This block lambda computes the factorial of an int value.
        MyFunc<Integer> factorial = (n) ->  {
            int result = 1;

            for(int i=1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factoral of 3 is " + factorial.func(3));
        System.out.println("The factoral of 3 is " + factorial.func(5));
        System.out.println("The factoral of 5 is " + factorial.func(9));
    }
}

/*
StringFunc remove = (str) ->  {
  String result = "";

  for(int i = 0; i < str.length(); i++)
    if(str.charAt(i) != ' ') result += str.charAt(i);

  return result;
};
 */