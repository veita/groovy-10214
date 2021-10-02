

package test;


import java.math.BigDecimal;
import java.util.Date;

import javax.xml.namespace.QName;


public final class Convert
{
	private Convert()
	{
	}

	public static final String getCanonicalLexicalRepresentation(CharSequence p_chseq)
	{
		return "foo";
	}

	public static final String getCanonicalLexicalRepresentation(Boolean p_bool)
	{
		return "foo";
	}

	public static final String getCanonicalLexicalRepresentation(Byte p_byte)
	{
		return "Byte " + p_byte;
	}

	public static final String getCanonicalLexicalRepresentation(Short p_short)
	{
		return "Short " + p_short;
	}

	public static final String getCanonicalLexicalRepresentation(Integer p_int)
	{
		return "Integer " + p_int;
	}

	public static final String getCanonicalLexicalRepresentation(Long p_long)
	{
		return "Long " + p_long;
	}

	public static final String getCanonicalLexicalRepresentation(Float p_float)
	{
		return "Float " + p_float;
	}

	public static final String getCanonicalLexicalRepresentation(Double p_double)
	{
		return "Double " + p_double;
	}

	public static final String getCanonicalLexicalRepresentation(BigDecimal p_decimal, boolean p_bInteger)
	{
		return "foo";
	}

	public static final String getCanonicalLexicalRepresentationDateTime(Date p_dt)
	{
		return "foo";
	}

	public static final String getCanonicalLexicalRepresentationDate(Date p_dt)
	{
		return "foo";
	}

	public static final String getCanonicalLexicalRepresentationTime(Date p_dt)
	{
		return "foo";
	}

	public static final String getCanonicalLexicalRepresentation(QName p_qnm)
	{
		return "foo";
	}

	public static String getCanonicalLexicalRepresentation(Object p_value, QName p_qnmType)
	{
		return "foo";
	}
}
