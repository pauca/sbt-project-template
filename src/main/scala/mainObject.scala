
import scopt._
import java.io.File

object mainObject{
    

    case class Config( foo: Int = -1, 
                                    mode: String = "",
                                    out: File = new File("."),
                                    verbose: Boolean = false, 
                                    debug: Boolean = false
                                    )
    
    
    // https://github.com/scopt/scopt
    val parser = new scopt.OptionParser[Config]("scopt") {
        head("sbt-projet-template", "3.x")
        opt[Int]('f', "foo") action { (x, c) =>  c.copy(foo = x) } text("foo is an integer property")
        
        opt[String]('m',"mode") action { (x, c) =>  c.copy(mode = x) } text("mode is a string property")
        
        opt[File]('o', "out") required() valueName("<file>") action { (x, c) =>
            c.copy(out = x) } text("out is a required file property")
        
        opt[Unit]("verbose") action { (_, c) =>
            c.copy(verbose = true) } text("verbose is a flag")
        
        opt[Unit]("debug") hidden() action { (_, c) =>
            c.copy(debug = true) } text("this option is hidden in the usage text")
      
        help("help") text("prints this usage text")
        
            note("some notes.\n")   
     
    }


    def main(args: Array[String]) :Unit  ={    
         // parser.parse returns Option[C]
        parser.parse(args, Config()) map { config =>
          // do stuff
            println("do stuff")
        } getOrElse {
          // arguments are bad, error message will have been displayed
        }
         
        sys.exit(0)
     }
    
}