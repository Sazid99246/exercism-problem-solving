proc abbreviate {phrase} {
    set res ""
    foreach word $phrase {
	set word [string trim $word _]
	set word [string trim $word -]
	foreach subword [split $word -] {
		append res [string toupper [string range $subword 0 0]]
	}
    }
	puts $res
    return $res
}