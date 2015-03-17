grammar list;

@header
{
    import java.util.List;
    import java.util.ArrayList;
}

list
    : BEGL (elems[new ArrayList<Integer>()])? ENDL
        {
            int sum = 0;
            if($elems.text != null)
                for(Integer i : $elems.listOut)
                    sum += i;
            System.out.println("List Sum: " + sum);
        }
;

elems [List<Integer> listIn] returns [List<Integer> listOut]
    : a=elem (SEP b=elem
            { listIn.add($b.value); }
        )*
            {
                listIn.add($a.value);
                $listOut = $listIn;
            }
;

elem returns [int value]
    : NUM { $value = $NUM.int; }
;

BEGL : '[';
ENDL : ']';
SEP : ',';
NUM : [0-9]+;
WS : (' '|'	'|'\r\n'|'\r')+ -> skip;
