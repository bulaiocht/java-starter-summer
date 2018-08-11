package io;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class IORunnerTest {

    private static final Logger logger = LoggerFactory.getLogger(IORunnerTest.class);
    private static final String RES = "src/test/resources";
    private static final String XANADU = "xanadu.txt";
    private static Path path;

    @Before
    public void init() throws IOException {
        MockitoAnnotations.initMocks(this);

        path = Paths.get(RES, "test");
        Files.deleteIfExists(path);
        File test = new File(path.toString());
        boolean newFile = test.createNewFile();
        assertThat(newFile).isTrue();

    }

    @Test
    public void fileInputOutputStreamsTest() {

        FileInputStream in = null;

        FileOutputStream out = null;

        try {

            in = new FileInputStream(new File(RES, XANADU));

            out = new FileOutputStream(path.toFile());

            int b;

            while ((b = in.read()) != -1) {
                out.write(b);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(in);
            closeSilently(out);
        }


    }

    @Test
    public void fileReaderWriterTest() {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(new File(RES, XANADU));
            out = new FileWriter(path.toFile());
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(in);
            closeSilently(out);
        }

    }

    @Test
    public void bufferedStreamsTest() {

        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader(new File(RES, XANADU)));
            out = new BufferedWriter(new FileWriter(path.toFile()));

            String line;

            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(in);
            closeSilently(out);
        }

    }

    @Test
    public void writeDataStreamsTest() {
        final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
        final int[] units = {12, 8, 13, 29, 50};
        final String[] descs = {
                "Java T-shirt",
                "Java Mug",
                "Duke Juggling Dolls",
                "Java Pin",
                "Java Key Chain"
        };

        DataOutputStream out = null;

        try {

            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(path.toFile())));
            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(out);
        }

        double price;
        int unit;
        String desc;

        DataInputStream in = null;

        try {

            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(path.toFile())));

            while (true) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.printf("You ordered %d" + " units of %s at $%.2f%n",
                        unit, desc, price);
            }
        } catch (EOFException e1) {

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(in);
        }

    }


    private void closeSilently(Closeable cl) {

        try {

            if (cl != null) cl.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void floatTest() {

        double one = 0.1;
        double two = 0.2;
        double three = 0.3;

        assertThat(one).isNotEqualTo(three - two);
    }

    @Test
    public void reflectionTest(){


        final Class<TestClass> testClassClass = TestClass.class;
        final ClassLoader classLoader = testClassClass.getClassLoader();
        final Constructor<?>[] declaredConstructors = testClassClass.getDeclaredConstructors();
        final Field[] declaredFields = testClassClass.getDeclaredFields();
        final Method[] declaredMethods = testClassClass.getDeclaredMethods();
        final Annotation[] annotations = testClassClass.getAnnotations();
        final Class<?>[] interfaces = testClassClass.getInterfaces();


        final Package[] definedPackages = classLoader.getDefinedPackages();

        for (Package definedPackage : definedPackages) {

            final Annotation[] declaredAnnotations = definedPackage.getDeclaredAnnotations();

            for (int i = 0; i < declaredAnnotations.length; i++) {

                logger.error(declaredAnnotations[i].toString());
            }
        }
    }
}