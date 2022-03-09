package ObjectDemo;
/*
    Object 是类层次结构的跟，每个类都有可以将Object 作为超类。所有类都直接或间接的继承自该类

    看方法的源码，选中方法，按下Ctrl + B

    建议子类冲刺从此方法
    自动生成即可  Alt + Insert
 */

public class toStringDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("风清扬");
        s.setAge(19);
        System.out.println(s);
        /*
        public void println(Object x) {
            String s = String.valueOf(x);
            if (getClass() == PrintStream.class) {
                // need to apply String.valueOf again since first invocation
                // might return null
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
        }

        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }


         */

    }
}
