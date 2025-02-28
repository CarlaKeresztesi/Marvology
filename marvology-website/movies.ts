import './src/style.scss'


const movieInputBox = document.querySelector<HTMLInputElement>('#moviesInput')
const moviesForm = document.querySelector<HTMLFormElement>('#moviesForm')
const moviesSelected = document.querySelector<HTMLDivElement>('.movies-container--selectedMovies')

if(!movieInputBox || !moviesForm || !moviesSelected){
    throw new Error('couldnt find it!')
}

type Hero = {
    id : number,
    alias: string,
    image_url: string,
    real_name: string,
    description: string
}

type Movie = {
    id : number,
    title : string,
    release_year : number
}

const handleMovieSearch = async (event : SubmitEvent) => {
    event?.preventDefault();
    moviesSelected.innerHTML = "";
    const response = await fetch("http://localhost:8080/movies/");
    const arrOfMovies = await response.json();
    const inputValue = movieInputBox.value;
        console.log(inputValue);
        console.log("movieSearch");
        console.log(arrOfMovies);
        arrOfMovies.forEach((movie : Movie) => {
            const newInput = inputValue.toLowerCase();
            const newTitle = movie.title.toLowerCase();
            console.log("not in the if")
            console.log(newInput)
            console.log(movie.title)
            if (newTitle.includes(newInput)) {
                const movieText = document.createElement('p');
                movieText.className = 'movie-text';
                moviesSelected.appendChild(movieText);
                movieText.innerText = `${movie.title}`;
                console.log("in if stat")
            }
        } )
}

moviesForm.addEventListener("submit", handleMovieSearch);