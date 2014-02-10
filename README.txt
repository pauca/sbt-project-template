
Tthis is a template for a scala project using sbt.

What is inside ?
*testing
*code checks
*comand line parser

#############################

git clone https://github.com/pauca/sbt-project-template.git
cd sbt-project-template
sbt

#############################
# command line parsing
# https://github.com/scopt/scopt
# check mainObject.scala

#############################
# code statistics:
# https://github.com/orrsella/sbt-stats

sbt stats

#############################
# scala style
# https://github.com/scalastyle/scalastyle-sbt-plugin
# to create configuration file

sbt scalastyle-generate-config

# check code with

sbt scalastyle


#############################
# assembly
# https://github.com/sbt/sbt-assembly

sbt assembly

#############################
# testing
# http://www.scalatest.org/

sbt test




#############################
git state
git add
git commit -m
git push -u origin master
