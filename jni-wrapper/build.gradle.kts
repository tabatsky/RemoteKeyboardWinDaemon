 plugins {
    id("jni-library")
}

library {
    binaries.configureEach {
        compileTask.get().compilerArgs.addAll(compileTask.get().toolChain.map {
            if (it is Gcc || it is Clang) listOf("--std=c++11", "-IC:\\Program Files\\Java\\jdk1.8.0_202\\include\\win32")
            else emptyList()
        })
    }
}