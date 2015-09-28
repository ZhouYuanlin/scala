/**
 * Created by mumutongxue on 9/24/15.
 */
// 定义一个实数类，包装了实数的化简以及加减乘除运算
class Rational(n:Int, d:Int) {
  //分母不能为零
  require(d != 0)
  // 隐式转换
  implicit def intToRational(x:Int) = new Rational(x)
  //g 用来保存分子分母的公约数
  private val g = gcd(n.abs,d.abs)
  //分子分母最简化
  val number = n/g
  val denom = d/g

  //重写同 String 方法
  override def toString: String =
    if (denom != 1)
      number + "/" + denom
    else
      number.toString
  //定义有理数加法
  def +(that:Rational):Rational=
    new Rational(
      number*that.denom + denom*that.number,
      denom*that.denom
    )
  def +(i:Int):Rational=
    new Rational(
      number+i*denom,denom
    )
  //定义有理数乘法
  def *(that:Rational):Rational=
    new Rational(
      number*that.number,denom*that.denom
    )
  //定义有理数除法
  def /(that:Rational):Rational=
    new Rational(
      number*that.denom,denom*that.number
    )
  //定义有理数减法
  def -(that:Rational):Rational=
    new Rational(
      number*that.denom - denom*that.number,
      denom*that.denom
    )
  //定义辅助构造函数，可以构造纯整数
  def this(n:Int) = this(n,1)
  //算分子分母的最大公约数
  private def gcd(a:Int, b:Int):Int =
    if(b == 0) a else gcd(b, a % b)
}
