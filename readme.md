# scalafix-codegen

Example how to use scalafix for code generation.  Run the following command in
sbt:

```
out/compile
```

- triggers a source generator that runs `in/scalafix ProcedureSyntax
  --out-from=in/src/main --out-to=out/target/scala-2.12/src_managed/main`
- generates a new file
  `out/target/scala-2.12/src_managed/main/scala/foo/Main.scala` which is a copy
  of the same file from the `in` project with the `ProcedureSyntax` rule
applied.

To customize the transformation, implement a Scalafix rule following
this tutorial here: https://scalacenter.github.io/scalafix/docs/developers/tutorial.html

Note that generating source code from manually edited code has several issues:

- goto definition and other navigation in the editor jumps to the generated
  source code instead of the original source code
- stack traces at runtime have line numbers from the generated source code
  instead of the original source code.

