/** Graph theory solution island grammar.  Written to define how to deal with graphs generated.
	Author:  Jonathan Throne
*/
grammar Grapher;
 
file : '<' 'workspace' '>' graph '</' 'workspace' '>' ;

graph : '<' 'graph' 'type=' '"' graph_type '"' '>' vertices edges s_node t_node '</' 'graph' '>' ;

graph_type : 'edmonds_karp' | 'dijkstra' ;

vertices : '<' 'vertices' '>' vertex+ '</' 'vertices' '>' ;

vertex : '<' 'vertex' 'id=' '"' ID '"' '/>' ;

edges : '<' 'edges' '>' edge+ '</' 'edges' '>' ;

edge : '<' 'edge' '>' source sink (capacity | weight) '</' 'edge' '>' ;

source : '<' 'source' 'id=' '"' ID '"' '/>' ;

sink : '<' 'sink' 'id=' '"' ID '"' '/>' ;

capacity : '<' 'capacity' 'value=' '"' INT '"' '/>' ;

weight : '<' 'weight' 'value=' '"' INT '"' '/>' ;

s_node : '<' 's_node' 'id=' '"' ID '"' '/>' ;

t_node : '<' 't_node' 'id=' '"' ID '"' '/>' ;

ID : LETTER (LETTER | [0-9])* ;
   fragment 
   LETTER : [a-zA-Z] ;

INT : DIGIT (DIGIT)* ; 
    fragment
    DIGIT : [0-9] ;

WHITESPACE : [ \t\n\r]+ -> skip ;

XML_COMMENT : '<!--' .*? '-->' -> skip ;

SL_COMMENT : '//' .*? '\n' -> skip ;

DOC_HTML : '<?xml' .*? '?>' -> skip ;

PRO_COMMENT : '<?' .*? '?>' -> skip ;