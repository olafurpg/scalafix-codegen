# scalafix-codegen

Example how to use scalafix for code generation.  Run the following command in
sbt:

```
in/scalafix ProcedureSyntax --out-from=in/src/main --out-to=out/src/main
```

This will generate a new file `out/src/main/scala/foo/Main.scala` which is a
copy of the same file from the `in` project with the `ProcedureSyntax` rule
applied. To customize the transformation, implement a Scalafix rule using
this tutorial here: https://scalacenter.github.io/scalafix/docs/developers/tutorial.html

