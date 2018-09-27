
/* jQuery UI autocomplete */

$(function() { "use strict";
    var availableTags = [
        "Talco",
        "Fixzo",
        "Gupso",
        "Zica",
        "Tebla",
        "Csmo",
        "Clojure",
        "Csmo",
        "Malc",
        "Zibn",
        "Kila",
        "Mols",
        "Dasper",
        "Kilas",
        "Tipes"
    ];
    $(".autocomplete-input").autocomplete({
        source: availableTags
    });
});
