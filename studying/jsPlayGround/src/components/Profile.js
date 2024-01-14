import AppLayout from "./AppLayout.js";

class Profile {
  constructor({ $target }) {
    const $wrapper = document.createElement("div");
    this.$wrapper = $wrapper;
    this.$appLayout = new AppLayout();

    this.$appLayout.$wrapper.appendChild($wrapper);

    $target.appendChild(this.$appLayout.$wrapper);

    this.render();
  }

  render() {
    this.$wrapper.innerHTML = `
      <div>이건 시작이야!!! 이건 밖에서 시작이야!!!</div>
      <div>하지만 진짜 이것이 좋은 레이 아웃일까??</div>

    `;
  }
}

export default Profile;
