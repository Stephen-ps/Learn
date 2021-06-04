package JavaCoreTech;


public class TheThirdChapter {

    public static void main(String[] args) {

        /**
         * ------------------------------字符串的拼接和修改----------------------------------------
         * String a = "wocainima";<p>
         * String b = "nimacaiwo";<p>
         * 字符串拼接<p>
         * String all = String.join("-----", a, b);<p>
         * System.out.println(all);<p>
         * print: wocainima-----nimacaiwo<p>
         * 修改字符串<p>
         * 注：这里的（0，7）指的是从第1个元素开始，到第8个元素后面再加上“ba”<p>
         * a = a.substring(0, 7) + "ba";<p>
         * System.out.println(a);<p>
         * print: wocainiba<p>
         * ------------------------------字符串的拼接和修改----------------------------------------
         */

//************************************************************************************************************************************************

        /**
         //一定不要使用=运算符检测两个字符串是否相等！ 这个运算符只能够确定两个字串是否放置在同一个位置上。
         //当然， 如果字符串放置在同一个位置上， 它们必然相等。
         //但是，完全有可能将内容相同的多个字符串的拷贝放置在不同的位置上。

         //如果字符串e 与字符串t 相等， 则返回true ; 否则， 返回false。
         //需要注意, e 与 t 可以是字符串变量，也可以是字符串字面量。
         //例如， 下列表达式是合法的："Hello".equals(greeting)
         //要想检测两个字符串是否相等，而不区分大小写， 可以使用equalsIgnoreCase 方法。
         //"WOCAINIMA".equalsIgnoreCase("wocainima")

         String e = "wocainima";
         String t = "nimacaiwo";
         int c = 0;

         //C 程序员从不使用=对字符串进行比较， 而使用strcmp 函数。
         //Java 的compareTo方法与strcmp 完全类似，
         //因此， 可以这样使用：if (e.compareTo("wocainima") == 0} . . ,
         //不过， 使用equals 看起来更为清晰。

         // 检查两个字符串是否相等，是就执行c += c,不是就执行c += 1。
         if (e.equals(t)) {
         c += c;
         } else c += 1;
         System.out.println(c);
         */
//************************************************************************************************************************************************


        /**
         --------------------------------------3.6.6 码点与代码单元------------------------
         //length 方法将返回采用UTF-16 编码表示的给定字符串所需要的代码单元数量。
         //例如：String greeting = "Hello";
         int n = greeting.length。; // is 5.
         //要想得到实际的长度，即码点数量，可以调用：int cpCount = e.codePointCount(0, e.length());
         //调用String.charAt(n) 将返回位置n 的代码单元，n 介于0 ~ s.length()-1 之间。例如：
         char first = e.charAtO); // first is 'w'
         char last = e.charAt(4) ; // last is ’i’
         //要想得到第i 个码点，应该使用下列语句
         int index = e.offsetByCodePoints(0, i);
         int cp = e.codePointAt(index) ;

         -----------------------------------码点------------------------------------------
         String greeting = "worinimadeb";
         int index = greeting.offsetByCodePoints(0,5);
         int cp = greeting.codePointAt(index);
         //找到数组中的某一个特定的字符
         char first = greeting.charAt(0);
         char last = greeting.charAt(9);
         System.out.println(index);
         //print: 5
         -----------------------------------码点------------------------------------------
         --------------------------------------3.6.6 码点与代码单元------------------------
         */

//************************************************************************************************************************************************


        /**
         //更容易的办法是使用codePoints 方法， 它会生成一个int 值的“ 流”，
         //每个int 值对应一个码点。（流将在卷II 的第2 章中讨论〉可以将它转换为一个数组（见3.10节)，再完成遍历。
         int[] codePoints = str.codePoints() .toArray()；
         //反之， 要把一个码点数组转换为一个字符串， 可以使用构造函数（我们将在第4 章详细讨论构造函数和new 操作符)。
         String str = new String(codePoints, 0, codePoints.length);


         //如果需要用许多小段的字符串构建一个字符串， 那么应该按照下列步骤进行。首先， 构
         //建一个空的字符串构建器：
         StringBuilder builder = new StringBuilderO;
         //当每次需要添加一部分内容时， 就调用append 方法。
         builder.append(ch); // appends a single character
         bui1der.append(str); // appends a string
         //在需要构建字符串时就凋用toString 方法， 将可以得到一个String 对象， 其中包含了构建器
         //中的字符序列。
         String completedString = builder.toStringO ;
         */


        /**
         ------------------------------------Scanner---------------------------------------------------
         //因为输入是可见的， 所以Scanner 类不适用于从控制台读取密码。Java SE 6 特别
         //引入了Console 类实现这个目的。要想读取一个密码， 可以采用下列代码：
         Console cons = System.console();
         String username = cons.readLine("User name: ");
         char[] passwd = cons.readPassword("Password:");
         ------------------------------------Scanner---------------------------------------------------
         */

//************************************************************************************************************************************************

        /**
         ---------------------------用于printf的转换符---------------------------------------------
         //   d    十进制整数      159
         //   x    十六进制整数     9f
         //   0    八进制整数      237
         //   f    定点浮点数      15.9e+01
         //   g    通用浮点数
         //   a    十六进制浮点数   0x1.fccdp3
         //   s    字符串          Hello
         //   C    字符            H
         //   b    布尔           True
         //   h    散列码          42628b2
         //   %    百分号          %
         ---------------------------用于printf的转换符---------------------------------------------

         ---------------------------用于printf的标志---------------------------------------------
         //   +                  打印正数和负数的符号      +3333.33
         //   空格               在正数之前添加空格        | 3333.33|
         //   0                 数字前面补0              003333.33
         //   -                 左对齐                  13333.33 |
         //   (                 将负数括在括号内         ( 3333.33 )
         //   ,                 添加分组分隔符           3,333.33
         //   #(对于f格式）      包含小数点               3,333.
         //   #(对于x或0格式）   添加前缀Ox或0           Oxcafe

         //   $    给定被格式化的参数索引。例如，%1$d，%1$x 将以十进制和十六进制格式打印第1个参数    159 9F
         //   <    格式化前面说明的数值。例如， %d%<X 以十进制和十六进制打印同一个数值              159 9F
         ---------------------------用于printf的标志---------------------------------------------


         double x = 10000.0 / 3.0;
         System.out.println(x);

         //从8开始有空格（“%8.2f）
         System.out.printf("%9.2f", x);

         System.out.printf("%1$d %2$tB %2$te,%2$tY","Due date: ",new Date());
         //--------------print: Due date: 四月 13,2021-------------------------
         */

        /**
         * 要想对文件进行读取， 就需要一个用File 对象构造一个Scanner 对象， 如下所示：
         * Scanner in = new Scanner(Paths.get("niyflle.txt") , "UTF-8") ;
         * 如果文件名中包含反斜杠符号， 就要记住在每个反斜杠之前再加一个额外的反斜杠：
         * “c:\\mydirectory\\myfile.txt”
         * -------------------------------------------------------------------------------------
         * 如果用一个不存在的文件构造一个Scanner, 或者用一个不能被创建的文件名构造一个PrintWriter,
         * 那么就会发生异常。Java 编译器认为这些异常比“ 被零除” 异常更严重。在第7 章中，将会
         * 学习各种处理异常的方式。现在，应该告知编译器： 已经知道有可能出现“ 输人/ 输出” 异常。这需要在main方法中用throws 子句标记， 如下所示：
         * public static void Daemon(String口args) throws IOException
         * {
         * Scanner in = new Scanner(Paths.get("myfi1e.txt"), "UTF-8") ;
         * ...
         * }
         */

//************************************************************************************************************************************************

        /**-------------------------------块作用域-------------------------------
         * 块（即复合语句）是指由一对大括号括起来的若干条简单的Java 语句。块确定了变量的作
         * 用域。一个块可以嵌套在另一个块中。下面就是在main 方法块中嵌套另一个语句块的示例。
         * public static void Daemon(String口args)
         * {
         * int n;
         * {
         * int k;
         * } // k is only defined up to here
         * }
         * ---------------------------------------------------------------------
         * 但是，不能在嵌套的两个块中声明同名的变量。例如，下面的代码就有错误，而无法通过编译：
         * public static void Daemon(String[] args)
         * {
         * int n;
         * {
         * int k;
         * int n; // Error can't redefine n in inner block
         * }
         * }
         * -------------------------------块作用域-------------------------------
         */

//************************************************************************************************************************************************

        /**
         * ---------------------------大数值BigInteger， BigDecimal-------------------------------
         BigInteger a = BigInteger.valueOf(1);
         for (int i = 1; i <= 10; i++) {
         a = a.multiply(BigInteger.valueOf(500 - i + 1)).divide(BigInteger.valueOf(i));
         }
         System.out.println(a);
         pring： 245810588801891098700
         -----------------------------大数值BigInteger， BigDecimal-------------------------------
         */

//************************************************************************************************************************************************

        /**----------------------遍历数组-----------------------------------------
         int[] a = new int[5];
         System.out.println(Arrays.toString(a));
         //遍历每一个数组中得值
         for (int element:a) {
         System.out.println(element);
         }
         print:
         0
         0
         0
         0
         0

         ------------------------------------------
         System.out.println(Arrays.toString(a));
         print: [0, 0, 0, 0, 0]
         //----------------------遍历数组-----------------------------------------
         */

//************************************************************************************************************************************************

        /**-----------重新初始化之前得数组-------------------------
         int[] a = new int[5];
         System.out.println(Arrays.toString(a));
         *****************************************
         a = new int[] {1,2,3,4,6};
         System.out.println(Arrays.toString(a));

         //print:          [0, 0, 0, 0, 0]
         //重新初始化的结果  [1, 2, 3, 4, 6]
         -------------重新初始化之前得数组-------------------------
         */


        /**-------------------------------数组拷贝---------------------------------------
         int[] originalArray = new int[]{1, 2, 3, 4, 5};
         //这种直接“=”的方式拷贝数组会直接把内存地址一起赋予给被赋予的变量
         int[] originalArray2 = originalArray;

         //注： 修改任意一个数组都会改变另一个数组的值
         //         originalArray2[4] = 12;
         //         System.out.println(Arrays.toString(originalArray));
         //         System.out.println(Arrays.toString(originalArray2));
         //  -------------------------------------------------
         //  ---           print: [1, 2, 3, 4, 12]         ---
         //  ---                  [1, 2, 3, 4, 12]         ---
         //  -------------------------------------------------

         // copyOf这种拷贝数组的方式是重新给予一块内存区域去出储存被拷贝的值，不会让两个数组同时指向一个内存区域。
         // 这里这是单纯的把originalArray数组的里的元素复制到了一个新的具有内存区域的copyArray数组里。
         int[] copyArray = Arrays.copyOf(originalArray, originalArray.length);

         System.out.println(Arrays.toString(copyArray));
         System.out.println(Arrays.toString(originalArray));
         //注： 可以看到，这里改变了copyArray里数组的值，但是再输出结果上并没有改变originalArray的值。
         //那么可以证明copyOf这种方法不会把内存一起拷贝。
         copyArray[4] = 5000;
         System.out.println(Arrays.toString(copyArray));
         System.out.println(Arrays.toString(originalArray));
         //  -------------------------------------------------
         //  ---         print: [1, 2, 3, 4, 5]            ---
         //  ---                [1, 2, 3, 4, 5]            ---
         //  ---                [1, 2, 3, 4, 5000]         ---
         //  ---                [1, 2, 3, 4, 5]            ---
         //  -------------------------------------------------
         //-------------------------------数组拷贝---------------------------------------
         */


//************************************************************************************************************************************************

        /**--------------------------数组排序算法-------------------------------------------------
         int[] array1 = new int[100];
         for (int i = 99; i >= 0; i--) {
         array1[i] = i;
         //结果：99.98.97..........0
         System.out.println(array1[i]);
         }
         //排序，从小到大
         Arrays.sort(array1);
         //结果：0.1.2........99
         System.out.println(Arrays.toString(array1));
         //---------------------------数组排序算法-------------------------------------------------
         */

//************************************************************************************************************************************************

        /**--------------------------------------------------------抽奖----------------------------------------------------------------
         Scanner in = new Scanner(System.in);

         System.out.println("how many number you draw");
         int k = in.nextInt();

         System.out.println("what is the highest number you draw");
         int n = in.nextInt();


         //----------------------------------------------------------------
         //这里一共需要两个数组，
         //一个数组numbers是决定抽奖池里到底是些什么数字
         //另一个数组results是最终抽奖出来的结果
         int[] numbers = new int[n];
         int[] results = new int[k];
         //抽奖池是由用户选择的最大值决定，最大值依次减1，直到为0
         for (int i = 0; i < numbers.length; i++) {
         numbers[i] = i + 1;
         }
         //System.out.println(Arrays.toString(numbers));
         //----------------------------------------------------------------

         for (int i = 0; i < results.length; i++) {
         //首先需要用到Math.random()这个方法，这个方法会从0-1里随机选择一个浮点数（包括0，但是不包括1）
         //注：如果出现1就会超过数组的范围，所以使用这个方法。
         int r = (int) (Math.random() * n);

         //将算出来的随机数字对应到数组里的元素然后赋值给数组results，之后的遍历就依次类推。
         results[i] = numbers[r];
         //System.out.println(Arrays.toString(results));

         //由于不能出现重复的数字，所以这里用数组中的最后一个元素替代已经抽到的元素，然后让数组的长度-1，这样，永远也不会抽到之前抽到的数字，那么最后一个元素也能被抽到。
         //相当于把抽到的数字移除，所以每遍历一边需要替换当前的值，然后在长度上减1.
         numbers[r] = numbers[n - 1];
         n--;
         //System.out.println(Arrays.toString(numbers));
         }

         //排序算法，从小达大
         Arrays.sort(results);
         System.out.println(Arrays.toString(results));
         //--------------------------------------------------------抽奖----------------------------------------------------------------
         */

//************************************************************************************************************************************************

        /**------------------------------------二维数组的应用-------------------------------------------------------------
         final double BASIC_RATE = 10;
         final int GROWTH_RATE_COLUMN = 6;
         final int YEARS_ROW = 8;

         double[][] balance = new double[YEARS_ROW][GROWTH_RATE_COLUMN];
         double[] interestRate = new double[YEARS_ROW];
         //计算利率，需要10-15%
         for (int i = 0; i < interestRate.length; i++) {
         interestRate[i] = (BASIC_RATE + i) / 100;
         }

         //初始值设定为10000
         for (int j = 0; j < balance[0].length; j++) {
         balance[0][j] = 10000;
         }

         //因为要寻找第一个0.0，所以行数需要从1开始。
         //balance.length是指行数的长度。
         for (int i = 1; i < balance.length; i++) {
         //balance[i]指的是列数的长度，i代表遍历行数，j代表遍历列数。
         for (int j = 0; j < balance[i].length; j++) {
         double oldBalanceGrowth = balance[i - 1][j] * interestRate[j];
         balance[i][j] = oldBalanceGrowth + balance[i - 1][j];
         }
         }

         //遍历二位数组需要用两个嵌套的循环，第一个是遍历行数，第二个则是把这一行每一个数字打印出来
         //        for (double[] row : balance) {
         //            for (double b : row) {
         //                System.out.printf("%10.2f", b);
         //            }
         //            System.out.println();
         //        }
         System.out.println(Arrays.toString(balance[1]));
         //------------------------------------二维数组的应用-------------------------------------------------------------
         */

//************************************************************************************************************************************************

        /**------------------------------不规则的二维数组应用-------------------------------------------
         final int MAX = 10;

         int[][] odds = new int[MAX+1][];

         //核心算法：每一次都规定了一个行中最大的元素数量
         //这里其实就是一个一维思想，odds[n]这里指的是行数，即遍历时，这一行能有多少个数字，每一次遍历都是在限制当前行数元素的数量。
         for (int n = 0; n <= MAX; n++) {
         odds[n] = new int[n+1];
         }

         //填充二维数组
         for (int n = 0; n < odds.length; n++){
         for (int k = 0; k < odds[n].length; k++){
         int lotteryOdds = 1;
         for (int i = 1; i <= k; i++) {
         lotteryOdds = lotteryOdds * (n - i + 1) / i;
         }
         odds[n][k] = lotteryOdds;
         }
         }
         for (int[] row : odds) {
         for (int odd : row) {
         System.out.printf("%4d", odd);
         }
         System.out.println();
         }
         //------------------------------不规则的二维数组应用-------------------------------------------
         */


    }
}
