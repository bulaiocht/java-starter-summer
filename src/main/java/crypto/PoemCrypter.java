package crypto;

import java.io.*;

public class PoemCrypter {

    private static final String CRYPT = "_crypt";

    private static final String DECRYPT = "_decrypt";

    public static void encrypt(File file) {

        File candidate = createCandidate(file, CRYPT);

        Reader reader = null;

        Writer writer = null;

        try {

            reader = new FileReader(file);
            writer = new FileWriter(candidate);

            boolean working = true;

            while (working) {

                int letter = reader.read();

                if (letter != -1) {

                    int shifted = shiftArithmetic(letter);

                    writer.write(shifted);

                } else working = false;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            closeSilently(reader);

            closeSilently(writer);

        }

    }

    public static void decrypt(File file) {

        final File candidate = createCandidate(file, DECRYPT);

        Reader reader = null;
        Writer writer = null;

        try {

            reader = new FileReader(file);
            writer = new FileWriter(candidate);

            boolean working = true;

            while (working) {
                int read = reader.read();
                if (read != -1) {
                    writer.write(shiftArithmeticBack(read));
                } else working = false;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(reader);
            closeSilently(writer);
        }

    }


    private static File createCandidate(File file, String suffix) {

        File candidate = new File(file.getPath() + suffix);

        if (candidate.exists()) {
            candidate.delete();
        }
        try {
            candidate.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candidate;
    }

    private static int shiftSquare(int value) {
        return (int) Math.pow(value, 2) + value;
    }

    private static int shiftSquareBack(int value) {
        return squareEquasionSolver(1, 1, -value);
    }

    public static int shiftArithmetic(int value) {

        return 31 + 17 * value;

    }

    private static int shiftArithmeticBack(int value) {
        return (value - 31) / 17;
    }


    private static void closeSilently(Closeable closeable) {

        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static int squareEquasionSolver(int a, int b, int c) {
        int dis = discriminant(a, b, c);
        if (dis > 0) {
            return (int) (-b + Math.sqrt(dis)) / (2 * a);
        } else if (dis == 0) {
            return -(b / (2 * a));
        } else throw new ArithmeticException("No roots");
    }

    private static int discriminant(int a, int b, int c) {
        return (int) Math.pow(b, 2) - 4 * a * c;
    }


}
