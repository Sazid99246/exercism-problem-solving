Function Get-Acronym() {
    <#
    .SYNOPSIS
    Get the acronym of a phrase.

    .DESCRIPTION
    Given a phrase, return the string acronym of that phrase.
    "As Soon As Possible" => "ASAP"
    
    .PARAMETER Phrase
    The phrase to get the acronym from.
    
    .EXAMPLE
    Get-Acronym -Phrase "As Soon As Possible"
    #>
    [CmdletBinding()]
    Param (
        [string]$Phrase
    )
    $p = $Phrase -replace "[-]", " "        # turn hyphens into spaces (i.e. word separators)
    $p = $p.Trim()                          # remove any leading/trailing whitespace -- there may have been a trailing "-" in $Phrase

    $p = $p -replace "[^\w ]" ,""   # allow only alphanumeric (letters, numbers) an underscore (_) or an asterisk (*).
    $p = $p -replace "[_*0-9]", ""  # remove underscores, asterisks, and numbers

    $TextInfo = (Get-Culture).TextInfo
    $p = $TextInfo.ToTitleCase($p)  # capitalize 1st letter (and lowercase the rest) of each word -- words in all uppercase aren't changed
    $a = $p -split "\s+" |
                    ForEach-Object{
                        $_.Substring(0,1)
                    }
    $a -join ""
}