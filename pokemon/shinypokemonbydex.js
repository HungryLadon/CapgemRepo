const commando = require('discord.js-commando');
const pokeGif = require ('pokemon-gif');
const compareString = require('string-similarity');

class shinypokegiftwoCommand extends commando.Command{
    constructor(client){
        super(client, {
            name: 'spgn',
            group: 'random',
            memberName: 'shinypokemontwo',
            description: 'gets you a shiny gif of the pokemon by its number'

        });
    }

    async run(message, args){
        const num = parseInt(args);
        console.log(num);
          if(isNaN(num)){
              message.channel.send('Argument Must be a number');
          }
          else if(num<=0){
            message.channel.send('Dex number cant be less than 0');
          }
          else if(num>721 && num<=801){
            message.channel.send('Pokemon after 721 haven\'t been implemented yet');
          }
          else if(num>801){
              message.channel.send('No pokemon was found');
          }
          else{
                message.channel.send(' ' , {
                files: [pokeGif(num, true)] // Or replace with FileOptions object
                });
          }
 
    }

}

module.exports = shinypokegiftwoCommand;