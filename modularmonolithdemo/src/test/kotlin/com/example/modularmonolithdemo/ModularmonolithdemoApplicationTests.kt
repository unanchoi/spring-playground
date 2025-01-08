package com.example.modularmonolithdemo

import com.tngtech.archunit.library.modules.syntax.ModuleRuleDefinition.modules
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter
import org.springframework.modulith.docs.Documenter.CanvasOptions
import org.springframework.modulith.docs.Documenter.DiagramOptions
import org.springframework.modulith.docs.Documenter.DiagramOptions.DiagramStyle
import org.springframework.modulith.test.ApplicationModuleTest

@ApplicationModuleTest
class ModularmonolithdemoApplicationTests {

    val modules = ApplicationModules.of(ModularmonolithdemoApplication::class.java);

    @Test
    fun contextLoads() {
        modules.forEach {
            println(it)
        }
    }

    @Test
    fun renderDocumentation() {
        var canvasOptions = CanvasOptions.defaults()
        // --> Optionally enable linking of JavaDoc
        // .withApiBase("<https://foobar.something>")
        ;
        var docOptions = DiagramOptions.defaults()
            .withStyle(DiagramStyle.UML);

        Documenter(modules)
            .writeDocumentation(docOptions, canvasOptions)

    }

}
