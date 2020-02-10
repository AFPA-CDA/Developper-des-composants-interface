$(document).ready(function() {
  $(".datepicker").datepicker({
    format: "dd/mm/yyyy",
    i18n: {
      months: [
        "Janvier",
        "Février",
        "Mars",
        "Avril",
        "Mai",
        "Juin",
        "Juillet",
        "Août",
        "Septembre",
        "Octobre",
        "Novembre",
        "Décembre"
      ],
      monthsShort: [
        "Jan",
        "Fev",
        "Mar",
        "Avr",
        "Mai",
        "Jun",
        "Jul",
        "Aou",
        "Sep",
        "Oct",
        "Nov",
        "Dec"
      ],
      weekdays: [
        "Dimanche",
        "Lundi",
        "Mardi",
        "Mercredi",
        "Jeudi",
        "Vendredi",
        "Samedi"
      ],
      weekdaysShort: ["Dim", "Lun", "Mar", "Mer", "Jeu", "Ven", "Sam"],
      weekdaysAbbrev: ["D", "L", "M", "M", "J", "V", "S"],
      close: "Fermer",
      cancel: "Annuler"
    }
  });
  $(".materialboxed").materialbox();
  $(".parallax").parallax();
  $("select").formSelect();
  $(".sidenav").sidenav();
});
