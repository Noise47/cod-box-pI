package frontend.scanner.general.token;

/**
 * Token class representing numbers
 * the regexp for the numbers is as follows
 * D stands for digit
 * 
 * (+|-)?( D+ | (D+.D*) | (D*.D+))(e(+|-)?D+)?
 *   1     2       3         4     5  6   7
 * 
 * 1: optional sign
 * 2: no dot
 * 3: dot with possibly empty rhs
 * 4: dot with possibly empty lhs
 * 5: scientific notation
 * 6: optional sign
 * 7: positive number of digits for the exponent
 * 
 * @author colonelmo
 *
 */
public class Number extends Token implements ModifiableText{

}
