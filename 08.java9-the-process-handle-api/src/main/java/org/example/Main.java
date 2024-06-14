package org.example;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("/Applications/Cryptr.app/Contents/MacOS/Cryptr");
        Process process = processBuilder.start();

        System.out.println("-- process handle --");
        ProcessHandle processHandle = process.toHandle();
        System.out.printf("PID: %s%n", processHandle.pid());
        System.out.printf("isAlive: %s%n", processHandle.isAlive());

        System.out.println("-- process info --");
        ProcessHandle.Info info = processHandle.info();
        info.command().ifPresent(str -> System.out.printf("Command: %s%n", str));
        info.commandLine().ifPresent(str -> System.out.printf("CommandLine: %s%n", str));
        info.arguments().ifPresent(array -> System.out.printf("Arguments: %s%n", Arrays.toString(array)));
        info.startInstant().ifPresent(instant -> System.out.printf("StartInstant: %s%n", instant));
        info.totalCpuDuration().ifPresent(duration -> System.out.printf("CpuDuration: %s millis%n", duration.toMillis()));
        info.user().ifPresent(str -> System.out.printf("User: %s%n", str));

        Thread.sleep(5000);
        System.out.println("-- destroying --");
        processHandle.destroy();
        //better use onExit to know when process exits (destroy() may not kill the process immediately)
        CompletableFuture<ProcessHandle> future = processHandle.onExit();
        ProcessHandle ph = future.get(); //blocks
        System.out.printf("isAlive: %s%n", ph.isAlive());
    }
}
