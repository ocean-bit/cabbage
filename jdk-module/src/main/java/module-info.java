module jdk.module {
    exports top.oceanbit.springboot;
    // jar文档 https://docs.oracle.com/en/java/javase/17/docs/specs/jar/jar.html#modular-jar-files
    requires java.base;
    // 非模块化jar 可从ModuleFinder.of(Path...)得出模块名，与jar文件名相关
    // 查看 https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/module/ModuleFinder.html#automatic-modules
    requires spring.boot;
    // 关于模块声明 https://docs.oracle.com/javase/specs/jls/se17/html/jls-7.html#jls-7.7
}