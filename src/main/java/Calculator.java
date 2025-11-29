public class Calculator {
    //Реализована через операцию сложения
    public int add(int a, int b) {
        return a + b;
    }

    //Реализована через операцию вычитания
    public int dif(int a, int b) {
        return b - a;
    }

    //Реализована Деления в столбик через встроенные операции
    public int div(int a, int b) {
        String out = "";
        if (b == 0) return Integer.MIN_VALUE;
        int flaga = 1;
        if (a < 0) {
            flaga = -1;
            a *= -1;
        }
        int flagb = 1;
        if (b < 0) {
            flagb = -1;
            b *= -1;
        }
        int flag = 0;
        String[] numbers = String.valueOf(a).split("");
        int numForDel = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (flag == 0) numForDel = Integer.parseInt(numbers[i]);
            else if (flag == 1) numForDel = Integer.parseInt(numbers[i - 1]) * 10 + Integer.parseInt(numbers[i]);
            if (numForDel < b) {
                if (!out.isEmpty() || numbers.length == 1) out += "0";
                flag = 1;
            } else {
                flag = 0;
                int ammount = 0;
                while (numForDel >= b) {
                    ammount++;
                    numForDel -= b;
                }
                out += ammount;
            }
        }
        return Integer.parseInt(out) * flaga * flagb;
    }

    //Реализовано через базовые раннее написанный метод сложения и операцию умножения,
    //все случаи с изменением знака обрабатываются через if конструкции после чего мы a раз
    //складываем число b с самим собой
    public int times(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int k = 1;
        if (a < 0 && b > 0) {
            k = -1;
            a *= k;
        } else if (a > 0 && b < 0) {
            k = -1;
            b *= k;
        } else if (a < 0 && b < 0) {
            a *= -1;
            b *= -1;
        }
        int out = 0;
        for (int i = 0; i < a; i++) out = add(out, b);
        return out * k;

    }

    //Частное от арифметической прогрессии n элементов a и b
    // и от разности чисел a и b
    public int solver(int a, int b, int n) {
        return div(times(n, add(a, b)), dif(a, b));
    }
}
