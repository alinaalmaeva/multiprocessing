import java.io.IOException;

public class Multiprocessing {
    public static void main(String[] args) {
        try {
            // Создаем процесс для запуска калькулятора
            ProcessBuilder calcProcessBuilder = new ProcessBuilder("C:/Windows/System32/calc.exe");
            Process calcProcess = calcProcessBuilder.start();

            // Создаем процесс для запуска word
            ProcessBuilder wordProcessBuilder = new ProcessBuilder("C:/Program Files/Microsoft Office/root/Office16/WINWORD.EXE");
            Process wordProcess = wordProcessBuilder.start();

            // Ожидаем завершения обоих процессов
            int calcExitCode = calcProcess.waitFor();
            int wordExitCode = wordProcess.waitFor();

            System.out.println("Калькулятор завершился с кодом: " + calcExitCode);
            System.out.println("Word завершилась с кодом: " + wordExitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
