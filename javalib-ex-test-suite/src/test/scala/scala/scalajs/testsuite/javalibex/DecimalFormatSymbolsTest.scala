package scala.scalajs.testsuite.javalibex

import java.text.DecimalFormatSymbols
import java.util.Locale

import org.junit.Assert._
import org.junit.{Before, Test}

import scala.scalajs.js.LocaleRegistry

class DecimalFormatSymbolsTest extends LocaleTestData {
  @Before def reset(): Unit = {
    // Ensure no locale has been installed
    LocaleRegistry.resetRegistry()
  }

  @Test def test_decimal_format_symborn_en_US(): Unit = {
    LocaleRegistry.installLocale(enUS)
    val dfs = DecimalFormatSymbols.getInstance(Locale.forLanguageTag("en_US"))

    assertEquals(dfs.getDecimalSeparator, '.')
    assertEquals(dfs.getMinusSign, '-')
    assertEquals(dfs.getZeroDigit, '0')
  }

}
