package ch17.sec01;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.function.*;
import java.util.stream.*;

public class ListFiles {
    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\KOSA\\Desktop\\JAVA_KNY");

        try (Stream<Path> stream = Files.list(dir)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("============");
        System.out.println("============");
        System.out.println("============");
        
        try (Stream<Path> stream = Files.walk(dir)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        System.out.println("============");
        System.out.println("============");
        System.out.println("============");
        
        int maxDepth = 10;

        // 파일 이름에 "example"이 포함된 파일을 찾는 조건
        BiPredicate<Path, BasicFileAttributes> matcher = (path, attr) -> 
            path.getFileName().toString().contains("KNY");
        
        Path newPath = Paths.get("C:\\Users\\KOSA\\Desktop");
        try (Stream<Path> stream = Files.find(newPath, maxDepth, matcher)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

