package com.az.reflect;

import java.io.*;

public class MyClassLoader extends ClassLoader {

    private String path;
    private String classLoaderName;

    public MyClassLoader(String path, String classLoaderName){
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    @Override
    protected Class findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassData(name);
        return defineClass(name, b , 0, b.length);
    }

    private byte[] loadClassData(String name) {
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try{
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i=0;
            while((i= in.read())!=-1){
                out.write(i);
            }

        }catch (Exception e ){
            e.printStackTrace();

        }finally{
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return out.toByteArray();
    }
}
