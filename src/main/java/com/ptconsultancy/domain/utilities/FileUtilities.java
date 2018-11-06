package com.ptconsultancy.domain.utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class FileUtilities {

    public static void writeStringToFile(String filename, String value) throws IOException {

        FileUtils.writeStringToFile(new File(filename), value, "UTF-8");
    }

    public static void appendStringToFile(String filename, String value) throws IOException {

        FileUtils.writeStringToFile(new File(filename), value, "UTF-8", true);
    }

    public static String writeFileToString(String filename) throws IOException {

        String value = FileUtils.readFileToString(new File(filename), "UTF-8");

        return value;
    }

    public static void copyAllFilesFromSrcDirToTargetDir(String src, String target) throws IOException {

        File source = new File(src);
        File dest = new File(target);

        if (source.isDirectory() && dest.isDirectory()) {
            FileUtils.copyDirectory(source, dest);
        } else {

        }
    }

    public static void deleteFile(String file) {
        FileUtils.deleteQuietly(new File(file));
    }

    public static void deleteDirectory(File dir) throws IOException { FileUtils.deleteDirectory(dir); }

    public static int getFileLengthInLines(String file) throws IOException {
        File src = new File(file);
        List<String> lines = FileUtils.readLines(src, "UTF-8");
        return lines.size();
    }

    public static int getFileLengthInLines(File file) throws IOException {
        List<String> lines = FileUtils.readLines(file, "UTF-8");
        return lines.size();
    }
}

